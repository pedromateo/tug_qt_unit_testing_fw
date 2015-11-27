/***************************************************************************
 *   Copyright (C) 2009 by VisualData                                      *
 *                                                                         *
 *   Redistributed under LGPL license terms.                               *
 ***************************************************************************/

#ifndef _SEGVCATCH_H
#define	_SEGVCATCH_H

#include <exception>
#include <stdexcept>

/*! \brief segvcatch namespace

*/
namespace segvcatch
{

/*! Signal handler, used to redefine standart exception throwing. */
typedef void (*handler)();

/*! Initialize segmentation violation handler.
    \param h (optional) - optional user's signal handler. By default used an internal signal handler to throw
 std::runtime_error.
   */
void init_segv(handler h = 0);

/*! Initialize floating point error handler.
    \param h - optional user's signal handler. By default used an internal signal handler to throw
 std::runtime_error.*/
void init_fpe(handler h = 0);


///
/// custom exception class
class SegfaultCatchedException : public std::exception
{
public:
    SegfaultCatchedException(std::string m) : msg(m) {}
    ~SegfaultCatchedException() throw() {}
    const char* what() const throw() { return msg.c_str(); }

private:
    std::string msg;
};

}

#endif	/* _SEGVCATCH_H */
